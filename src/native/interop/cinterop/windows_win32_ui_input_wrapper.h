#ifndef WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_WINDOWS_WIN32_UI_INPUT_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_WINDOWS_WIN32_UI_INPUT_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int64_t windowssysWindowsWin32UiInputDefRawInputProc(void* parawinput, int32_t ninput, uint32_t cbsizeheader);
int32_t windowssysWindowsWin32UiInputGetCIMSSM(void* inputmessagesource);
int32_t windowssysWindowsWin32UiInputGetCurrentInputMessageSource(void* inputmessagesource);
uint32_t windowssysWindowsWin32UiInputGetRawInputBuffer(void* pdata, void* pcbsize, uint32_t cbsizeheader);
uint32_t windowssysWindowsWin32UiInputGetRawInputData(void* hrawinput, uint32_t uicommand, void* pdata, void* pcbsize, uint32_t cbsizeheader);
uint32_t windowssysWindowsWin32UiInputGetRawInputDeviceInfoA(void* hdevice, uint32_t uicommand, void* pdata, void* pcbsize);
uint32_t windowssysWindowsWin32UiInputGetRawInputDeviceInfoW(void* hdevice, uint32_t uicommand, void* pdata, void* pcbsize);
uint32_t windowssysWindowsWin32UiInputGetRawInputDeviceList(void* prawinputdevicelist, void* puinumdevices, uint32_t cbsize);
uint32_t windowssysWindowsWin32UiInputGetRegisteredRawInputDevices(void* prawinputdevices, void* puinumdevices, uint32_t cbsize);
int32_t windowssysWindowsWin32UiInputRegisterRawInputDevices(void* prawinputdevices, uint32_t uinumdevices, uint32_t cbsize);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_WINDOWS_WIN32_UI_INPUT_WRAPPER_H */
