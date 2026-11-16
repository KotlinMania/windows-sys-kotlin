#ifndef WINDOWSSYS_WINDOWS_WIN32_DEVICES_COMMUNICATION_WINDOWS_WIN32_DEVICES_COMMUNICATION_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_DEVICES_COMMUNICATION_WINDOWS_WIN32_DEVICES_COMMUNICATION_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32DevicesCommunicationBuildCommDCBA(void* lpdef, void* lpdcb);
int32_t windowssysWindowsWin32DevicesCommunicationBuildCommDCBAndTimeoutsA(void* lpdef, void* lpdcb, void* lpcommtimeouts);
int32_t windowssysWindowsWin32DevicesCommunicationBuildCommDCBAndTimeoutsW(void* lpdef, void* lpdcb, void* lpcommtimeouts);
int32_t windowssysWindowsWin32DevicesCommunicationBuildCommDCBW(void* lpdef, void* lpdcb);
int32_t windowssysWindowsWin32DevicesCommunicationClearCommBreak(void* hfile);
int32_t windowssysWindowsWin32DevicesCommunicationClearCommError(void* hfile, void* lperrors, void* lpstat);
int32_t windowssysWindowsWin32DevicesCommunicationCommConfigDialogA(void* lpszname, void* hwnd, void* lpcc);
int32_t windowssysWindowsWin32DevicesCommunicationCommConfigDialogW(void* lpszname, void* hwnd, void* lpcc);
int32_t windowssysWindowsWin32DevicesCommunicationEscapeCommFunction(void* hfile, uint32_t dwfunc);
int32_t windowssysWindowsWin32DevicesCommunicationGetCommConfig(void* hcommdev, void* lpcc, void* lpdwsize);
int32_t windowssysWindowsWin32DevicesCommunicationGetCommMask(void* hfile, void* lpevtmask);
int32_t windowssysWindowsWin32DevicesCommunicationGetCommModemStatus(void* hfile, void* lpmodemstat);
uint32_t windowssysWindowsWin32DevicesCommunicationGetCommPorts(void* lpportnumbers, uint32_t uportnumberscount, void* puportnumbersfound);
int32_t windowssysWindowsWin32DevicesCommunicationGetCommProperties(void* hfile, void* lpcommprop);
int32_t windowssysWindowsWin32DevicesCommunicationGetCommState(void* hfile, void* lpdcb);
int32_t windowssysWindowsWin32DevicesCommunicationGetCommTimeouts(void* hfile, void* lpcommtimeouts);
int32_t windowssysWindowsWin32DevicesCommunicationGetDefaultCommConfigA(void* lpszname, void* lpcc, void* lpdwsize);
int32_t windowssysWindowsWin32DevicesCommunicationGetDefaultCommConfigW(void* lpszname, void* lpcc, void* lpdwsize);
void* windowssysWindowsWin32DevicesCommunicationOpenCommPort(uint32_t uportnumber, uint32_t dwdesiredaccess, uint32_t dwflagsandattributes);
int32_t windowssysWindowsWin32DevicesCommunicationPurgeComm(void* hfile, uint32_t dwflags);
int32_t windowssysWindowsWin32DevicesCommunicationSetCommBreak(void* hfile);
int32_t windowssysWindowsWin32DevicesCommunicationSetCommConfig(void* hcommdev, void* lpcc, uint32_t dwsize);
int32_t windowssysWindowsWin32DevicesCommunicationSetCommMask(void* hfile, uint32_t dwevtmask);
int32_t windowssysWindowsWin32DevicesCommunicationSetCommState(void* hfile, void* lpdcb);
int32_t windowssysWindowsWin32DevicesCommunicationSetCommTimeouts(void* hfile, void* lpcommtimeouts);
int32_t windowssysWindowsWin32DevicesCommunicationSetDefaultCommConfigA(void* lpszname, void* lpcc, uint32_t dwsize);
int32_t windowssysWindowsWin32DevicesCommunicationSetDefaultCommConfigW(void* lpszname, void* lpcc, uint32_t dwsize);
int32_t windowssysWindowsWin32DevicesCommunicationSetupComm(void* hfile, uint32_t dwinqueue, uint32_t dwoutqueue);
int32_t windowssysWindowsWin32DevicesCommunicationTransmitCommChar(void* hfile, int8_t cchar);
int32_t windowssysWindowsWin32DevicesCommunicationWaitCommEvent(void* hfile, void* lpevtmask, void* lpoverlapped);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_DEVICES_COMMUNICATION_WINDOWS_WIN32_DEVICES_COMMUNICATION_WRAPPER_H */
