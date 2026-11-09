#ifndef WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_TOUCH_WINDOWS_WIN32_UI_INPUT_TOUCH_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_TOUCH_WINDOWS_WIN32_UI_INPUT_TOUCH_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_ui_input_touch_CloseGestureInfoHandle(void* hgestureinfo);
int32_t windowssys_windows_win32_ui_input_touch_CloseTouchInputHandle(void* htouchinput);
int32_t windowssys_windows_win32_ui_input_touch_GetGestureConfig(void* hwnd, uint32_t dwreserved, uint32_t dwflags, void* pcids, void* pgestureconfig, uint32_t cbsize);
int32_t windowssys_windows_win32_ui_input_touch_GetGestureExtraArgs(void* hgestureinfo, uint32_t cbextraargs, void* pextraargs);
int32_t windowssys_windows_win32_ui_input_touch_GetGestureInfo(void* hgestureinfo, void* pgestureinfo);
int32_t windowssys_windows_win32_ui_input_touch_GetTouchInputInfo(void* htouchinput, uint32_t cinputs, void* pinputs, int32_t cbsize);
int32_t windowssys_windows_win32_ui_input_touch_IsTouchWindow(void* hwnd, void* pulflags);
int32_t windowssys_windows_win32_ui_input_touch_RegisterTouchWindow(void* hwnd, uint32_t ulflags);
int32_t windowssys_windows_win32_ui_input_touch_SetGestureConfig(void* hwnd, uint32_t dwreserved, uint32_t cids, void* pgestureconfig, uint32_t cbsize);
int32_t windowssys_windows_win32_ui_input_touch_UnregisterTouchWindow(void* hwnd);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_TOUCH_WINDOWS_WIN32_UI_INPUT_TOUCH_WRAPPER_H */
