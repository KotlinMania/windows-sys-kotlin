#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_RESTARTMANAGER_WINDOWS_WIN32_SYSTEM_RESTARTMANAGER_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_RESTARTMANAGER_WINDOWS_WIN32_SYSTEM_RESTARTMANAGER_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssysWindowsWin32SystemRestartmanagerRmAddFilter(uint32_t dwsessionhandle, void* strmodulename, void* pprocess, void* strserviceshortname, int32_t filteraction);
uint32_t windowssysWindowsWin32SystemRestartmanagerRmCancelCurrentTask(uint32_t dwsessionhandle);
uint32_t windowssysWindowsWin32SystemRestartmanagerRmEndSession(uint32_t dwsessionhandle);
uint32_t windowssysWindowsWin32SystemRestartmanagerRmGetFilterList(uint32_t dwsessionhandle, void* pbfilterbuf, uint32_t cbfilterbuf, void* cbfilterbufneeded);
uint32_t windowssysWindowsWin32SystemRestartmanagerRmGetList(uint32_t dwsessionhandle, void* pnprocinfoneeded, void* pnprocinfo, void* rgaffectedapps, void* lpdwrebootreasons);
uint32_t windowssysWindowsWin32SystemRestartmanagerRmJoinSession(void* psessionhandle, void* strsessionkey);
uint32_t windowssysWindowsWin32SystemRestartmanagerRmRegisterResources(uint32_t dwsessionhandle, uint32_t nfiles, void* rgsfilenames, uint32_t napplications, void* rgapplications, uint32_t nservices, void* rgsservicenames);
uint32_t windowssysWindowsWin32SystemRestartmanagerRmRemoveFilter(uint32_t dwsessionhandle, void* strmodulename, void* pprocess, void* strserviceshortname);
uint32_t windowssysWindowsWin32SystemRestartmanagerRmRestart(uint32_t dwsessionhandle, uint32_t dwrestartflags, void* fnstatus);
uint32_t windowssysWindowsWin32SystemRestartmanagerRmShutdown(uint32_t dwsessionhandle, uint32_t lactionflags, void* fnstatus);
uint32_t windowssysWindowsWin32SystemRestartmanagerRmStartSession(void* psessionhandle, uint32_t dwsessionflags, void* strsessionkey);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_RESTARTMANAGER_WINDOWS_WIN32_SYSTEM_RESTARTMANAGER_WRAPPER_H */
