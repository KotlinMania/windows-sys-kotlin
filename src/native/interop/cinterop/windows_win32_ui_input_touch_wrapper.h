#ifndef WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_TOUCH_WINDOWS_WIN32_UI_INPUT_TOUCH_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_TOUCH_WINDOWS_WIN32_UI_INPUT_TOUCH_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32UiInputTouchCloseGestureInfoHandle(void* hgestureinfo);
int32_t windowssysWindowsWin32UiInputTouchCloseTouchInputHandle(void* htouchinput);
int32_t windowssysWindowsWin32UiInputTouchGetGestureConfig(void* hwnd, uint32_t dwreserved, uint32_t dwflags, void* pcids, void* pgestureconfig, uint32_t cbsize);
int32_t windowssysWindowsWin32UiInputTouchGetGestureExtraArgs(void* hgestureinfo, uint32_t cbextraargs, void* pextraargs);
int32_t windowssysWindowsWin32UiInputTouchGetGestureInfo(void* hgestureinfo, void* pgestureinfo);
int32_t windowssysWindowsWin32UiInputTouchGetTouchInputInfo(void* htouchinput, uint32_t cinputs, void* pinputs, int32_t cbsize);
int32_t windowssysWindowsWin32UiInputTouchIsTouchWindow(void* hwnd, void* pulflags);
int32_t windowssysWindowsWin32UiInputTouchRegisterTouchWindow(void* hwnd, uint32_t ulflags);
int32_t windowssysWindowsWin32UiInputTouchSetGestureConfig(void* hwnd, uint32_t dwreserved, uint32_t cids, void* pgestureconfig, uint32_t cbsize);
int32_t windowssysWindowsWin32UiInputTouchUnregisterTouchWindow(void* hwnd);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_TOUCH_WINDOWS_WIN32_UI_INPUT_TOUCH_WRAPPER_H */
