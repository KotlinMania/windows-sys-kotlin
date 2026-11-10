#ifndef WINDOWSSYS_WINDOWS_WIN32_DEVICES_COMMUNICATION_WINDOWS_WIN32_DEVICES_COMMUNICATION_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_DEVICES_COMMUNICATION_WINDOWS_WIN32_DEVICES_COMMUNICATION_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_devices_communication_buildCommDCBA(void* lpdef, void* lpdcb);
int32_t windowssys_windows_win32_devices_communication_buildCommDCBAndTimeoutsA(void* lpdef, void* lpdcb, void* lpcommtimeouts);
int32_t windowssys_windows_win32_devices_communication_buildCommDCBAndTimeoutsW(void* lpdef, void* lpdcb, void* lpcommtimeouts);
int32_t windowssys_windows_win32_devices_communication_buildCommDCBW(void* lpdef, void* lpdcb);
int32_t windowssys_windows_win32_devices_communication_clearCommBreak(void* hfile);
int32_t windowssys_windows_win32_devices_communication_clearCommError(void* hfile, void* lperrors, void* lpstat);
int32_t windowssys_windows_win32_devices_communication_commConfigDialogA(void* lpszname, void* hwnd, void* lpcc);
int32_t windowssys_windows_win32_devices_communication_commConfigDialogW(void* lpszname, void* hwnd, void* lpcc);
int32_t windowssys_windows_win32_devices_communication_escapeCommFunction(void* hfile, uint32_t dwfunc);
int32_t windowssys_windows_win32_devices_communication_getCommConfig(void* hcommdev, void* lpcc, void* lpdwsize);
int32_t windowssys_windows_win32_devices_communication_getCommMask(void* hfile, void* lpevtmask);
int32_t windowssys_windows_win32_devices_communication_getCommModemStatus(void* hfile, void* lpmodemstat);
uint32_t windowssys_windows_win32_devices_communication_getCommPorts(void* lpportnumbers, uint32_t uportnumberscount, void* puportnumbersfound);
int32_t windowssys_windows_win32_devices_communication_getCommProperties(void* hfile, void* lpcommprop);
int32_t windowssys_windows_win32_devices_communication_getCommState(void* hfile, void* lpdcb);
int32_t windowssys_windows_win32_devices_communication_getCommTimeouts(void* hfile, void* lpcommtimeouts);
int32_t windowssys_windows_win32_devices_communication_getDefaultCommConfigA(void* lpszname, void* lpcc, void* lpdwsize);
int32_t windowssys_windows_win32_devices_communication_getDefaultCommConfigW(void* lpszname, void* lpcc, void* lpdwsize);
void* windowssys_windows_win32_devices_communication_openCommPort(uint32_t uportnumber, uint32_t dwdesiredaccess, uint32_t dwflagsandattributes);
int32_t windowssys_windows_win32_devices_communication_purgeComm(void* hfile, uint32_t dwflags);
int32_t windowssys_windows_win32_devices_communication_setCommBreak(void* hfile);
int32_t windowssys_windows_win32_devices_communication_setCommConfig(void* hcommdev, void* lpcc, uint32_t dwsize);
int32_t windowssys_windows_win32_devices_communication_setCommMask(void* hfile, uint32_t dwevtmask);
int32_t windowssys_windows_win32_devices_communication_setCommState(void* hfile, void* lpdcb);
int32_t windowssys_windows_win32_devices_communication_setCommTimeouts(void* hfile, void* lpcommtimeouts);
int32_t windowssys_windows_win32_devices_communication_setDefaultCommConfigA(void* lpszname, void* lpcc, uint32_t dwsize);
int32_t windowssys_windows_win32_devices_communication_setDefaultCommConfigW(void* lpszname, void* lpcc, uint32_t dwsize);
int32_t windowssys_windows_win32_devices_communication_setupComm(void* hfile, uint32_t dwinqueue, uint32_t dwoutqueue);
int32_t windowssys_windows_win32_devices_communication_transmitCommChar(void* hfile, int8_t cchar);
int32_t windowssys_windows_win32_devices_communication_waitCommEvent(void* hfile, void* lpevtmask, void* lpoverlapped);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_DEVICES_COMMUNICATION_WINDOWS_WIN32_DEVICES_COMMUNICATION_WRAPPER_H */
