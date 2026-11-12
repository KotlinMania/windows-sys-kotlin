#ifndef WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_XBOXCONTROLLER_WINDOWS_WIN32_UI_INPUT_XBOXCONTROLLER_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_XBOXCONTROLLER_WINDOWS_WIN32_UI_INPUT_XBOXCONTROLLER_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void windowssysWindowsWin32UiInputXboxcontrollerXInputEnable(int32_t enable);
uint32_t windowssysWindowsWin32UiInputXboxcontrollerXInputGetAudioDeviceIds(uint32_t dwuserindex, void* prenderdeviceid, void* prendercount, void* pcapturedeviceid, void* pcapturecount);
uint32_t windowssysWindowsWin32UiInputXboxcontrollerXInputGetBatteryInformation(uint32_t dwuserindex, uint8_t devtype, void* pbatteryinformation);
uint32_t windowssysWindowsWin32UiInputXboxcontrollerXInputGetCapabilities(uint32_t dwuserindex, uint32_t dwflags, void* pcapabilities);
uint32_t windowssysWindowsWin32UiInputXboxcontrollerXInputGetKeystroke(uint32_t dwuserindex, uint32_t dwreserved, void* pkeystroke);
uint32_t windowssysWindowsWin32UiInputXboxcontrollerXInputGetState(uint32_t dwuserindex, void* pstate);
uint32_t windowssysWindowsWin32UiInputXboxcontrollerXInputSetState(uint32_t dwuserindex, void* pvibration);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_XBOXCONTROLLER_WINDOWS_WIN32_UI_INPUT_XBOXCONTROLLER_WRAPPER_H */
