#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_STATIONSANDDESKTOPS_WINDOWS_WIN32_SYSTEM_STATIONSANDDESKTOPS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_STATIONSANDDESKTOPS_WINDOWS_WIN32_SYSTEM_STATIONSANDDESKTOPS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_stationsanddesktops_broadcastSystemMessageA(uint32_t flags, void* lpinfo, uint32_t msg, uint64_t wparam, int64_t lparam);
int32_t windowssys_windows_win32_system_stationsanddesktops_broadcastSystemMessageExA(uint32_t flags, void* lpinfo, uint32_t msg, uint64_t wparam, int64_t lparam, void* pbsminfo);
int32_t windowssys_windows_win32_system_stationsanddesktops_broadcastSystemMessageExW(uint32_t flags, void* lpinfo, uint32_t msg, uint64_t wparam, int64_t lparam, void* pbsminfo);
int32_t windowssys_windows_win32_system_stationsanddesktops_broadcastSystemMessageW(uint32_t flags, void* lpinfo, uint32_t msg, uint64_t wparam, int64_t lparam);
int32_t windowssys_windows_win32_system_stationsanddesktops_closeDesktop(void* hdesktop);
int32_t windowssys_windows_win32_system_stationsanddesktops_closeWindowStation(void* hwinsta);
void* windowssys_windows_win32_system_stationsanddesktops_createDesktopA(void* lpszdesktop, void* lpszdevice, void* pdevmode, uint32_t dwflags, uint32_t dwdesiredaccess, void* lpsa);
void* windowssys_windows_win32_system_stationsanddesktops_createDesktopExA(void* lpszdesktop, void* lpszdevice, void* pdevmode, uint32_t dwflags, uint32_t dwdesiredaccess, void* lpsa, uint32_t ulheapsize, void* pvoid);
void* windowssys_windows_win32_system_stationsanddesktops_createDesktopExW(void* lpszdesktop, void* lpszdevice, void* pdevmode, uint32_t dwflags, uint32_t dwdesiredaccess, void* lpsa, uint32_t ulheapsize, void* pvoid);
void* windowssys_windows_win32_system_stationsanddesktops_createDesktopW(void* lpszdesktop, void* lpszdevice, void* pdevmode, uint32_t dwflags, uint32_t dwdesiredaccess, void* lpsa);
void* windowssys_windows_win32_system_stationsanddesktops_createWindowStationA(void* lpwinsta, uint32_t dwflags, uint32_t dwdesiredaccess, void* lpsa);
void* windowssys_windows_win32_system_stationsanddesktops_createWindowStationW(void* lpwinsta, uint32_t dwflags, uint32_t dwdesiredaccess, void* lpsa);
int32_t windowssys_windows_win32_system_stationsanddesktops_enumDesktopsA(void* hwinsta, void* lpenumfunc, int64_t lparam);
int32_t windowssys_windows_win32_system_stationsanddesktops_enumDesktopsW(void* hwinsta, void* lpenumfunc, int64_t lparam);
int32_t windowssys_windows_win32_system_stationsanddesktops_enumWindowStationsA(void* lpenumfunc, int64_t lparam);
int32_t windowssys_windows_win32_system_stationsanddesktops_enumWindowStationsW(void* lpenumfunc, int64_t lparam);
void* windowssys_windows_win32_system_stationsanddesktops_getProcessWindowStation(void);
void* windowssys_windows_win32_system_stationsanddesktops_getThreadDesktop(uint32_t dwthreadid);
int32_t windowssys_windows_win32_system_stationsanddesktops_getUserObjectInformationA(void* hobj, int32_t nindex, void* pvinfo, uint32_t nlength, void* lpnlengthneeded);
int32_t windowssys_windows_win32_system_stationsanddesktops_getUserObjectInformationW(void* hobj, int32_t nindex, void* pvinfo, uint32_t nlength, void* lpnlengthneeded);
void* windowssys_windows_win32_system_stationsanddesktops_openDesktopA(void* lpszdesktop, uint32_t dwflags, int32_t finherit, uint32_t dwdesiredaccess);
void* windowssys_windows_win32_system_stationsanddesktops_openDesktopW(void* lpszdesktop, uint32_t dwflags, int32_t finherit, uint32_t dwdesiredaccess);
void* windowssys_windows_win32_system_stationsanddesktops_openInputDesktop(uint32_t dwflags, int32_t finherit, uint32_t dwdesiredaccess);
void* windowssys_windows_win32_system_stationsanddesktops_openWindowStationA(void* lpszwinsta, int32_t finherit, uint32_t dwdesiredaccess);
void* windowssys_windows_win32_system_stationsanddesktops_openWindowStationW(void* lpszwinsta, int32_t finherit, uint32_t dwdesiredaccess);
int32_t windowssys_windows_win32_system_stationsanddesktops_setProcessWindowStation(void* hwinsta);
int32_t windowssys_windows_win32_system_stationsanddesktops_setThreadDesktop(void* hdesktop);
int32_t windowssys_windows_win32_system_stationsanddesktops_setUserObjectInformationA(void* hobj, int32_t nindex, void* pvinfo, uint32_t nlength);
int32_t windowssys_windows_win32_system_stationsanddesktops_setUserObjectInformationW(void* hobj, int32_t nindex, void* pvinfo, uint32_t nlength);
int32_t windowssys_windows_win32_system_stationsanddesktops_switchDesktop(void* hdesktop);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_STATIONSANDDESKTOPS_WINDOWS_WIN32_SYSTEM_STATIONSANDDESKTOPS_WRAPPER_H */
