#ifndef WINDOWSSYS_WINDOWS_WIN32_DEVICES_COMMUNICATION_WINDOWS_WIN32_DEVICES_COMMUNICATION_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_DEVICES_COMMUNICATION_WINDOWS_WIN32_DEVICES_COMMUNICATION_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_devices_communication_BuildCommDCBA(void* lpdef, void* lpdcb);
int32_t windowssys_windows_win32_devices_communication_BuildCommDCBAndTimeoutsA(void* lpdef, void* lpdcb, void* lpcommtimeouts);
int32_t windowssys_windows_win32_devices_communication_BuildCommDCBAndTimeoutsW(void* lpdef, void* lpdcb, void* lpcommtimeouts);
int32_t windowssys_windows_win32_devices_communication_BuildCommDCBW(void* lpdef, void* lpdcb);
int32_t windowssys_windows_win32_devices_communication_ClearCommBreak(void* hfile);
int32_t windowssys_windows_win32_devices_communication_ClearCommError(void* hfile, void* lperrors, void* lpstat);
int32_t windowssys_windows_win32_devices_communication_CommConfigDialogA(void* lpszname, void* hwnd, void* lpcc);
int32_t windowssys_windows_win32_devices_communication_CommConfigDialogW(void* lpszname, void* hwnd, void* lpcc);
int32_t windowssys_windows_win32_devices_communication_EscapeCommFunction(void* hfile, uint32_t dwfunc);
int32_t windowssys_windows_win32_devices_communication_GetCommConfig(void* hcommdev, void* lpcc, void* lpdwsize);
int32_t windowssys_windows_win32_devices_communication_GetCommMask(void* hfile, void* lpevtmask);
int32_t windowssys_windows_win32_devices_communication_GetCommModemStatus(void* hfile, void* lpmodemstat);
uint32_t windowssys_windows_win32_devices_communication_GetCommPorts(void* lpportnumbers, uint32_t uportnumberscount, void* puportnumbersfound);
int32_t windowssys_windows_win32_devices_communication_GetCommProperties(void* hfile, void* lpcommprop);
int32_t windowssys_windows_win32_devices_communication_GetCommState(void* hfile, void* lpdcb);
int32_t windowssys_windows_win32_devices_communication_GetCommTimeouts(void* hfile, void* lpcommtimeouts);
int32_t windowssys_windows_win32_devices_communication_GetDefaultCommConfigA(void* lpszname, void* lpcc, void* lpdwsize);
int32_t windowssys_windows_win32_devices_communication_GetDefaultCommConfigW(void* lpszname, void* lpcc, void* lpdwsize);
void* windowssys_windows_win32_devices_communication_OpenCommPort(uint32_t uportnumber, uint32_t dwdesiredaccess, uint32_t dwflagsandattributes);
int32_t windowssys_windows_win32_devices_communication_PurgeComm(void* hfile, uint32_t dwflags);
int32_t windowssys_windows_win32_devices_communication_SetCommBreak(void* hfile);
int32_t windowssys_windows_win32_devices_communication_SetCommConfig(void* hcommdev, void* lpcc, uint32_t dwsize);
int32_t windowssys_windows_win32_devices_communication_SetCommMask(void* hfile, uint32_t dwevtmask);
int32_t windowssys_windows_win32_devices_communication_SetCommState(void* hfile, void* lpdcb);
int32_t windowssys_windows_win32_devices_communication_SetCommTimeouts(void* hfile, void* lpcommtimeouts);
int32_t windowssys_windows_win32_devices_communication_SetDefaultCommConfigA(void* lpszname, void* lpcc, uint32_t dwsize);
int32_t windowssys_windows_win32_devices_communication_SetDefaultCommConfigW(void* lpszname, void* lpcc, uint32_t dwsize);
int32_t windowssys_windows_win32_devices_communication_SetupComm(void* hfile, uint32_t dwinqueue, uint32_t dwoutqueue);
int32_t windowssys_windows_win32_devices_communication_TransmitCommChar(void* hfile, int8_t cchar);
int32_t windowssys_windows_win32_devices_communication_WaitCommEvent(void* hfile, void* lpevtmask, void* lpoverlapped);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_DEVICES_COMMUNICATION_WINDOWS_WIN32_DEVICES_COMMUNICATION_WRAPPER_H */
