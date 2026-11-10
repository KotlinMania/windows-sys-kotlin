#ifndef WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_XBOXCONTROLLER_WINDOWS_WIN32_UI_INPUT_XBOXCONTROLLER_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_XBOXCONTROLLER_WINDOWS_WIN32_UI_INPUT_XBOXCONTROLLER_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void windowssys_windows_win32_ui_input_xboxcontroller_xInputEnable(int32_t enable);
uint32_t windowssys_windows_win32_ui_input_xboxcontroller_xInputGetAudioDeviceIds(uint32_t dwuserindex, void* prenderdeviceid, void* prendercount, void* pcapturedeviceid, void* pcapturecount);
uint32_t windowssys_windows_win32_ui_input_xboxcontroller_xInputGetBatteryInformation(uint32_t dwuserindex, uint8_t devtype, void* pbatteryinformation);
uint32_t windowssys_windows_win32_ui_input_xboxcontroller_xInputGetCapabilities(uint32_t dwuserindex, uint32_t dwflags, void* pcapabilities);
uint32_t windowssys_windows_win32_ui_input_xboxcontroller_xInputGetKeystroke(uint32_t dwuserindex, uint32_t dwreserved, void* pkeystroke);
uint32_t windowssys_windows_win32_ui_input_xboxcontroller_xInputGetState(uint32_t dwuserindex, void* pstate);
uint32_t windowssys_windows_win32_ui_input_xboxcontroller_xInputSetState(uint32_t dwuserindex, void* pvibration);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_XBOXCONTROLLER_WINDOWS_WIN32_UI_INPUT_XBOXCONTROLLER_WRAPPER_H */
