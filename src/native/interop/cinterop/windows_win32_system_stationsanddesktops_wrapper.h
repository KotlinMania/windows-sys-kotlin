#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_STATIONSANDDESKTOPS_WINDOWS_WIN32_SYSTEM_STATIONSANDDESKTOPS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_STATIONSANDDESKTOPS_WINDOWS_WIN32_SYSTEM_STATIONSANDDESKTOPS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_stationsanddesktops_BroadcastSystemMessageA(uint32_t flags, void* lpinfo, uint32_t msg, uint64_t wparam, int64_t lparam);
int32_t windowssys_windows_win32_system_stationsanddesktops_BroadcastSystemMessageExA(uint32_t flags, void* lpinfo, uint32_t msg, uint64_t wparam, int64_t lparam, void* pbsminfo);
int32_t windowssys_windows_win32_system_stationsanddesktops_BroadcastSystemMessageExW(uint32_t flags, void* lpinfo, uint32_t msg, uint64_t wparam, int64_t lparam, void* pbsminfo);
int32_t windowssys_windows_win32_system_stationsanddesktops_BroadcastSystemMessageW(uint32_t flags, void* lpinfo, uint32_t msg, uint64_t wparam, int64_t lparam);
int32_t windowssys_windows_win32_system_stationsanddesktops_CloseDesktop(void* hdesktop);
int32_t windowssys_windows_win32_system_stationsanddesktops_CloseWindowStation(void* hwinsta);
void* windowssys_windows_win32_system_stationsanddesktops_CreateDesktopA(void* lpszdesktop, void* lpszdevice, void* pdevmode, uint32_t dwflags, uint32_t dwdesiredaccess, void* lpsa);
void* windowssys_windows_win32_system_stationsanddesktops_CreateDesktopExA(void* lpszdesktop, void* lpszdevice, void* pdevmode, uint32_t dwflags, uint32_t dwdesiredaccess, void* lpsa, uint32_t ulheapsize, void* pvoid);
void* windowssys_windows_win32_system_stationsanddesktops_CreateDesktopExW(void* lpszdesktop, void* lpszdevice, void* pdevmode, uint32_t dwflags, uint32_t dwdesiredaccess, void* lpsa, uint32_t ulheapsize, void* pvoid);
void* windowssys_windows_win32_system_stationsanddesktops_CreateDesktopW(void* lpszdesktop, void* lpszdevice, void* pdevmode, uint32_t dwflags, uint32_t dwdesiredaccess, void* lpsa);
void* windowssys_windows_win32_system_stationsanddesktops_CreateWindowStationA(void* lpwinsta, uint32_t dwflags, uint32_t dwdesiredaccess, void* lpsa);
void* windowssys_windows_win32_system_stationsanddesktops_CreateWindowStationW(void* lpwinsta, uint32_t dwflags, uint32_t dwdesiredaccess, void* lpsa);
int32_t windowssys_windows_win32_system_stationsanddesktops_EnumDesktopsA(void* hwinsta, void* lpenumfunc, int64_t lparam);
int32_t windowssys_windows_win32_system_stationsanddesktops_EnumDesktopsW(void* hwinsta, void* lpenumfunc, int64_t lparam);
int32_t windowssys_windows_win32_system_stationsanddesktops_EnumWindowStationsA(void* lpenumfunc, int64_t lparam);
int32_t windowssys_windows_win32_system_stationsanddesktops_EnumWindowStationsW(void* lpenumfunc, int64_t lparam);
void* windowssys_windows_win32_system_stationsanddesktops_GetProcessWindowStation(void);
void* windowssys_windows_win32_system_stationsanddesktops_GetThreadDesktop(uint32_t dwthreadid);
int32_t windowssys_windows_win32_system_stationsanddesktops_GetUserObjectInformationA(void* hobj, int32_t nindex, void* pvinfo, uint32_t nlength, void* lpnlengthneeded);
int32_t windowssys_windows_win32_system_stationsanddesktops_GetUserObjectInformationW(void* hobj, int32_t nindex, void* pvinfo, uint32_t nlength, void* lpnlengthneeded);
void* windowssys_windows_win32_system_stationsanddesktops_OpenDesktopA(void* lpszdesktop, uint32_t dwflags, int32_t finherit, uint32_t dwdesiredaccess);
void* windowssys_windows_win32_system_stationsanddesktops_OpenDesktopW(void* lpszdesktop, uint32_t dwflags, int32_t finherit, uint32_t dwdesiredaccess);
void* windowssys_windows_win32_system_stationsanddesktops_OpenInputDesktop(uint32_t dwflags, int32_t finherit, uint32_t dwdesiredaccess);
void* windowssys_windows_win32_system_stationsanddesktops_OpenWindowStationA(void* lpszwinsta, int32_t finherit, uint32_t dwdesiredaccess);
void* windowssys_windows_win32_system_stationsanddesktops_OpenWindowStationW(void* lpszwinsta, int32_t finherit, uint32_t dwdesiredaccess);
int32_t windowssys_windows_win32_system_stationsanddesktops_SetProcessWindowStation(void* hwinsta);
int32_t windowssys_windows_win32_system_stationsanddesktops_SetThreadDesktop(void* hdesktop);
int32_t windowssys_windows_win32_system_stationsanddesktops_SetUserObjectInformationA(void* hobj, int32_t nindex, void* pvinfo, uint32_t nlength);
int32_t windowssys_windows_win32_system_stationsanddesktops_SetUserObjectInformationW(void* hobj, int32_t nindex, void* pvinfo, uint32_t nlength);
int32_t windowssys_windows_win32_system_stationsanddesktops_SwitchDesktop(void* hdesktop);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_STATIONSANDDESKTOPS_WINDOWS_WIN32_SYSTEM_STATIONSANDDESKTOPS_WRAPPER_H */
