#ifndef WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_WINDOWS_WIN32_UI_INPUT_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_WINDOWS_WIN32_UI_INPUT_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int64_t windowssys_windows_win32_ui_input_defRawInputProc(void* parawinput, int32_t ninput, uint32_t cbsizeheader);
int32_t windowssys_windows_win32_ui_input_getCIMSSM(void* inputmessagesource);
int32_t windowssys_windows_win32_ui_input_getCurrentInputMessageSource(void* inputmessagesource);
uint32_t windowssys_windows_win32_ui_input_getRawInputBuffer(void* pdata, void* pcbsize, uint32_t cbsizeheader);
uint32_t windowssys_windows_win32_ui_input_getRawInputData(void* hrawinput, uint32_t uicommand, void* pdata, void* pcbsize, uint32_t cbsizeheader);
uint32_t windowssys_windows_win32_ui_input_getRawInputDeviceInfoA(void* hdevice, uint32_t uicommand, void* pdata, void* pcbsize);
uint32_t windowssys_windows_win32_ui_input_getRawInputDeviceInfoW(void* hdevice, uint32_t uicommand, void* pdata, void* pcbsize);
uint32_t windowssys_windows_win32_ui_input_getRawInputDeviceList(void* prawinputdevicelist, void* puinumdevices, uint32_t cbsize);
uint32_t windowssys_windows_win32_ui_input_getRegisteredRawInputDevices(void* prawinputdevices, void* puinumdevices, uint32_t cbsize);
int32_t windowssys_windows_win32_ui_input_registerRawInputDevices(void* prawinputdevices, uint32_t uinumdevices, uint32_t cbsize);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_WINDOWS_WIN32_UI_INPUT_WRAPPER_H */
