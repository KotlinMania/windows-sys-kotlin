#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_STATIONSANDDESKTOPS_WINDOWS_WIN32_SYSTEM_STATIONSANDDESKTOPS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_STATIONSANDDESKTOPS_WINDOWS_WIN32_SYSTEM_STATIONSANDDESKTOPS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageA(uint32_t flags, void* lpinfo, uint32_t msg, uint64_t wparam, int64_t lparam);
int32_t windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageExA(uint32_t flags, void* lpinfo, uint32_t msg, uint64_t wparam, int64_t lparam, void* pbsminfo);
int32_t windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageExW(uint32_t flags, void* lpinfo, uint32_t msg, uint64_t wparam, int64_t lparam, void* pbsminfo);
int32_t windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageW(uint32_t flags, void* lpinfo, uint32_t msg, uint64_t wparam, int64_t lparam);
int32_t windowssysWindowsWin32SystemStationsanddesktopsCloseDesktop(void* hdesktop);
int32_t windowssysWindowsWin32SystemStationsanddesktopsCloseWindowStation(void* hwinsta);
void* windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopA(void* lpszdesktop, void* lpszdevice, void* pdevmode, uint32_t dwflags, uint32_t dwdesiredaccess, void* lpsa);
void* windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopExA(void* lpszdesktop, void* lpszdevice, void* pdevmode, uint32_t dwflags, uint32_t dwdesiredaccess, void* lpsa, uint32_t ulheapsize, void* pvoid);
void* windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopExW(void* lpszdesktop, void* lpszdevice, void* pdevmode, uint32_t dwflags, uint32_t dwdesiredaccess, void* lpsa, uint32_t ulheapsize, void* pvoid);
void* windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopW(void* lpszdesktop, void* lpszdevice, void* pdevmode, uint32_t dwflags, uint32_t dwdesiredaccess, void* lpsa);
void* windowssysWindowsWin32SystemStationsanddesktopsCreateWindowStationA(void* lpwinsta, uint32_t dwflags, uint32_t dwdesiredaccess, void* lpsa);
void* windowssysWindowsWin32SystemStationsanddesktopsCreateWindowStationW(void* lpwinsta, uint32_t dwflags, uint32_t dwdesiredaccess, void* lpsa);
int32_t windowssysWindowsWin32SystemStationsanddesktopsEnumDesktopsA(void* hwinsta, void* lpenumfunc, int64_t lparam);
int32_t windowssysWindowsWin32SystemStationsanddesktopsEnumDesktopsW(void* hwinsta, void* lpenumfunc, int64_t lparam);
int32_t windowssysWindowsWin32SystemStationsanddesktopsEnumWindowStationsA(void* lpenumfunc, int64_t lparam);
int32_t windowssysWindowsWin32SystemStationsanddesktopsEnumWindowStationsW(void* lpenumfunc, int64_t lparam);
void* windowssysWindowsWin32SystemStationsanddesktopsGetProcessWindowStation(void);
void* windowssysWindowsWin32SystemStationsanddesktopsGetThreadDesktop(uint32_t dwthreadid);
int32_t windowssysWindowsWin32SystemStationsanddesktopsGetUserObjectInformationA(void* hobj, int32_t nindex, void* pvinfo, uint32_t nlength, void* lpnlengthneeded);
int32_t windowssysWindowsWin32SystemStationsanddesktopsGetUserObjectInformationW(void* hobj, int32_t nindex, void* pvinfo, uint32_t nlength, void* lpnlengthneeded);
void* windowssysWindowsWin32SystemStationsanddesktopsOpenDesktopA(void* lpszdesktop, uint32_t dwflags, int32_t finherit, uint32_t dwdesiredaccess);
void* windowssysWindowsWin32SystemStationsanddesktopsOpenDesktopW(void* lpszdesktop, uint32_t dwflags, int32_t finherit, uint32_t dwdesiredaccess);
void* windowssysWindowsWin32SystemStationsanddesktopsOpenInputDesktop(uint32_t dwflags, int32_t finherit, uint32_t dwdesiredaccess);
void* windowssysWindowsWin32SystemStationsanddesktopsOpenWindowStationA(void* lpszwinsta, int32_t finherit, uint32_t dwdesiredaccess);
void* windowssysWindowsWin32SystemStationsanddesktopsOpenWindowStationW(void* lpszwinsta, int32_t finherit, uint32_t dwdesiredaccess);
int32_t windowssysWindowsWin32SystemStationsanddesktopsSetProcessWindowStation(void* hwinsta);
int32_t windowssysWindowsWin32SystemStationsanddesktopsSetThreadDesktop(void* hdesktop);
int32_t windowssysWindowsWin32SystemStationsanddesktopsSetUserObjectInformationA(void* hobj, int32_t nindex, void* pvinfo, uint32_t nlength);
int32_t windowssysWindowsWin32SystemStationsanddesktopsSetUserObjectInformationW(void* hobj, int32_t nindex, void* pvinfo, uint32_t nlength);
int32_t windowssysWindowsWin32SystemStationsanddesktopsSwitchDesktop(void* hdesktop);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_STATIONSANDDESKTOPS_WINDOWS_WIN32_SYSTEM_STATIONSANDDESKTOPS_WRAPPER_H */
