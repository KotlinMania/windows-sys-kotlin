#ifndef WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_TOUCH_WINDOWS_WIN32_UI_INPUT_TOUCH_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_TOUCH_WINDOWS_WIN32_UI_INPUT_TOUCH_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_ui_input_touch_closeGestureInfoHandle(void* hgestureinfo);
int32_t windowssys_windows_win32_ui_input_touch_closeTouchInputHandle(void* htouchinput);
int32_t windowssys_windows_win32_ui_input_touch_getGestureConfig(void* hwnd, uint32_t dwreserved, uint32_t dwflags, void* pcids, void* pgestureconfig, uint32_t cbsize);
int32_t windowssys_windows_win32_ui_input_touch_getGestureExtraArgs(void* hgestureinfo, uint32_t cbextraargs, void* pextraargs);
int32_t windowssys_windows_win32_ui_input_touch_getGestureInfo(void* hgestureinfo, void* pgestureinfo);
int32_t windowssys_windows_win32_ui_input_touch_getTouchInputInfo(void* htouchinput, uint32_t cinputs, void* pinputs, int32_t cbsize);
int32_t windowssys_windows_win32_ui_input_touch_isTouchWindow(void* hwnd, void* pulflags);
int32_t windowssys_windows_win32_ui_input_touch_registerTouchWindow(void* hwnd, uint32_t ulflags);
int32_t windowssys_windows_win32_ui_input_touch_setGestureConfig(void* hwnd, uint32_t dwreserved, uint32_t cids, void* pgestureconfig, uint32_t cbsize);
int32_t windowssys_windows_win32_ui_input_touch_unregisterTouchWindow(void* hwnd);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_TOUCH_WINDOWS_WIN32_UI_INPUT_TOUCH_WRAPPER_H */
