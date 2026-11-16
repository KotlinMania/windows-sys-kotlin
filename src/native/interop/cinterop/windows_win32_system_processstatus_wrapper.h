#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_PROCESSSTATUS_WINDOWS_WIN32_SYSTEM_PROCESSSTATUS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_PROCESSSTATUS_WINDOWS_WIN32_SYSTEM_PROCESSSTATUS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32SystemProcessstatusEmptyWorkingSet(void* hprocess);
int32_t windowssysWindowsWin32SystemProcessstatusEnumDeviceDrivers(void* lpimagebase, uint32_t cb, void* lpcbneeded);
int32_t windowssysWindowsWin32SystemProcessstatusEnumPageFilesA(void* pcallbackroutine, void* pcontext);
int32_t windowssysWindowsWin32SystemProcessstatusEnumPageFilesW(void* pcallbackroutine, void* pcontext);
int32_t windowssysWindowsWin32SystemProcessstatusEnumProcessModules(void* hprocess, void* lphmodule, uint32_t cb, void* lpcbneeded);
int32_t windowssysWindowsWin32SystemProcessstatusEnumProcessModulesEx(void* hprocess, void* lphmodule, uint32_t cb, void* lpcbneeded, uint32_t dwfilterflag);
int32_t windowssysWindowsWin32SystemProcessstatusEnumProcesses(void* lpidprocess, uint32_t cb, void* lpcbneeded);
uint32_t windowssysWindowsWin32SystemProcessstatusGetDeviceDriverBaseNameA(void* imagebase, void* lpfilename, uint32_t nsize);
uint32_t windowssysWindowsWin32SystemProcessstatusGetDeviceDriverBaseNameW(void* imagebase, void* lpbasename, uint32_t nsize);
uint32_t windowssysWindowsWin32SystemProcessstatusGetDeviceDriverFileNameA(void* imagebase, void* lpfilename, uint32_t nsize);
uint32_t windowssysWindowsWin32SystemProcessstatusGetDeviceDriverFileNameW(void* imagebase, void* lpfilename, uint32_t nsize);
uint32_t windowssysWindowsWin32SystemProcessstatusGetMappedFileNameA(void* hprocess, void* lpv, void* lpfilename, uint32_t nsize);
uint32_t windowssysWindowsWin32SystemProcessstatusGetMappedFileNameW(void* hprocess, void* lpv, void* lpfilename, uint32_t nsize);
uint32_t windowssysWindowsWin32SystemProcessstatusGetModuleBaseNameA(void* hprocess, void* hmodule, void* lpbasename, uint32_t nsize);
uint32_t windowssysWindowsWin32SystemProcessstatusGetModuleBaseNameW(void* hprocess, void* hmodule, void* lpbasename, uint32_t nsize);
uint32_t windowssysWindowsWin32SystemProcessstatusGetModuleFileNameExA(void* hprocess, void* hmodule, void* lpfilename, uint32_t nsize);
uint32_t windowssysWindowsWin32SystemProcessstatusGetModuleFileNameExW(void* hprocess, void* hmodule, void* lpfilename, uint32_t nsize);
int32_t windowssysWindowsWin32SystemProcessstatusGetModuleInformation(void* hprocess, void* hmodule, void* lpmodinfo, uint32_t cb);
int32_t windowssysWindowsWin32SystemProcessstatusGetPerformanceInfo(void* pperformanceinformation, uint32_t cb);
uint32_t windowssysWindowsWin32SystemProcessstatusGetProcessImageFileNameA(void* hprocess, void* lpimagefilename, uint32_t nsize);
uint32_t windowssysWindowsWin32SystemProcessstatusGetProcessImageFileNameW(void* hprocess, void* lpimagefilename, uint32_t nsize);
int32_t windowssysWindowsWin32SystemProcessstatusGetProcessMemoryInfo(void* process, void* ppsmemcounters, uint32_t cb);
int32_t windowssysWindowsWin32SystemProcessstatusGetWsChanges(void* hprocess, void* lpwatchinfo, uint32_t cb);
int32_t windowssysWindowsWin32SystemProcessstatusGetWsChangesEx(void* hprocess, void* lpwatchinfoex, void* cb);
int32_t windowssysWindowsWin32SystemProcessstatusInitializeProcessForWsWatch(void* hprocess);
int32_t windowssysWindowsWin32SystemProcessstatusK32EmptyWorkingSet(void* hprocess);
int32_t windowssysWindowsWin32SystemProcessstatusK32EnumDeviceDrivers(void* lpimagebase, uint32_t cb, void* lpcbneeded);
int32_t windowssysWindowsWin32SystemProcessstatusK32EnumPageFilesA(void* pcallbackroutine, void* pcontext);
int32_t windowssysWindowsWin32SystemProcessstatusK32EnumPageFilesW(void* pcallbackroutine, void* pcontext);
int32_t windowssysWindowsWin32SystemProcessstatusK32EnumProcessModules(void* hprocess, void* lphmodule, uint32_t cb, void* lpcbneeded);
int32_t windowssysWindowsWin32SystemProcessstatusK32EnumProcessModulesEx(void* hprocess, void* lphmodule, uint32_t cb, void* lpcbneeded, uint32_t dwfilterflag);
int32_t windowssysWindowsWin32SystemProcessstatusK32EnumProcesses(void* lpidprocess, uint32_t cb, void* lpcbneeded);
uint32_t windowssysWindowsWin32SystemProcessstatusK32GetDeviceDriverBaseNameA(void* imagebase, void* lpfilename, uint32_t nsize);
uint32_t windowssysWindowsWin32SystemProcessstatusK32GetDeviceDriverBaseNameW(void* imagebase, void* lpbasename, uint32_t nsize);
uint32_t windowssysWindowsWin32SystemProcessstatusK32GetDeviceDriverFileNameA(void* imagebase, void* lpfilename, uint32_t nsize);
uint32_t windowssysWindowsWin32SystemProcessstatusK32GetDeviceDriverFileNameW(void* imagebase, void* lpfilename, uint32_t nsize);
uint32_t windowssysWindowsWin32SystemProcessstatusK32GetMappedFileNameA(void* hprocess, void* lpv, void* lpfilename, uint32_t nsize);
uint32_t windowssysWindowsWin32SystemProcessstatusK32GetMappedFileNameW(void* hprocess, void* lpv, void* lpfilename, uint32_t nsize);
uint32_t windowssysWindowsWin32SystemProcessstatusK32GetModuleBaseNameA(void* hprocess, void* hmodule, void* lpbasename, uint32_t nsize);
uint32_t windowssysWindowsWin32SystemProcessstatusK32GetModuleBaseNameW(void* hprocess, void* hmodule, void* lpbasename, uint32_t nsize);
uint32_t windowssysWindowsWin32SystemProcessstatusK32GetModuleFileNameExA(void* hprocess, void* hmodule, void* lpfilename, uint32_t nsize);
uint32_t windowssysWindowsWin32SystemProcessstatusK32GetModuleFileNameExW(void* hprocess, void* hmodule, void* lpfilename, uint32_t nsize);
int32_t windowssysWindowsWin32SystemProcessstatusK32GetModuleInformation(void* hprocess, void* hmodule, void* lpmodinfo, uint32_t cb);
int32_t windowssysWindowsWin32SystemProcessstatusK32GetPerformanceInfo(void* pperformanceinformation, uint32_t cb);
uint32_t windowssysWindowsWin32SystemProcessstatusK32GetProcessImageFileNameA(void* hprocess, void* lpimagefilename, uint32_t nsize);
uint32_t windowssysWindowsWin32SystemProcessstatusK32GetProcessImageFileNameW(void* hprocess, void* lpimagefilename, uint32_t nsize);
int32_t windowssysWindowsWin32SystemProcessstatusK32GetProcessMemoryInfo(void* process, void* ppsmemcounters, uint32_t cb);
int32_t windowssysWindowsWin32SystemProcessstatusK32GetWsChanges(void* hprocess, void* lpwatchinfo, uint32_t cb);
int32_t windowssysWindowsWin32SystemProcessstatusK32GetWsChangesEx(void* hprocess, void* lpwatchinfoex, void* cb);
int32_t windowssysWindowsWin32SystemProcessstatusK32InitializeProcessForWsWatch(void* hprocess);
int32_t windowssysWindowsWin32SystemProcessstatusK32QueryWorkingSet(void* hprocess, void* pv, uint32_t cb);
int32_t windowssysWindowsWin32SystemProcessstatusK32QueryWorkingSetEx(void* hprocess, void* pv, uint32_t cb);
int32_t windowssysWindowsWin32SystemProcessstatusQueryWorkingSet(void* hprocess, void* pv, uint32_t cb);
int32_t windowssysWindowsWin32SystemProcessstatusQueryWorkingSetEx(void* hprocess, void* pv, uint32_t cb);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_PROCESSSTATUS_WINDOWS_WIN32_SYSTEM_PROCESSSTATUS_WRAPPER_H */
