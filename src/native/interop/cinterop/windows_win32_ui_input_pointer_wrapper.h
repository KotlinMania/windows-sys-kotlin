#ifndef WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_POINTER_WINDOWS_WIN32_UI_INPUT_POINTER_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_POINTER_WINDOWS_WIN32_UI_INPUT_POINTER_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_ui_input_pointer_EnableMouseInPointer(int32_t fenable);
int32_t windowssys_windows_win32_ui_input_pointer_GetPointerCursorId(uint32_t pointerid, void* cursorid);
int32_t windowssys_windows_win32_ui_input_pointer_GetPointerDevice(void* device, void* pointerdevice);
int32_t windowssys_windows_win32_ui_input_pointer_GetPointerDeviceCursors(void* device, void* cursorcount, void* devicecursors);
int32_t windowssys_windows_win32_ui_input_pointer_GetPointerDeviceProperties(void* device, void* propertycount, void* pointerproperties);
int32_t windowssys_windows_win32_ui_input_pointer_GetPointerDeviceRects(void* device, void* pointerdevicerect, void* displayrect);
int32_t windowssys_windows_win32_ui_input_pointer_GetPointerDevices(void* devicecount, void* pointerdevices);
int32_t windowssys_windows_win32_ui_input_pointer_GetPointerFrameInfo(uint32_t pointerid, void* pointercount, void* pointerinfo);
int32_t windowssys_windows_win32_ui_input_pointer_GetPointerFrameInfoHistory(uint32_t pointerid, void* entriescount, void* pointercount, void* pointerinfo);
int32_t windowssys_windows_win32_ui_input_pointer_GetPointerFramePenInfo(uint32_t pointerid, void* pointercount, void* peninfo);
int32_t windowssys_windows_win32_ui_input_pointer_GetPointerFramePenInfoHistory(uint32_t pointerid, void* entriescount, void* pointercount, void* peninfo);
int32_t windowssys_windows_win32_ui_input_pointer_GetPointerFrameTouchInfo(uint32_t pointerid, void* pointercount, void* touchinfo);
int32_t windowssys_windows_win32_ui_input_pointer_GetPointerFrameTouchInfoHistory(uint32_t pointerid, void* entriescount, void* pointercount, void* touchinfo);
int32_t windowssys_windows_win32_ui_input_pointer_GetPointerInfo(uint32_t pointerid, void* pointerinfo);
int32_t windowssys_windows_win32_ui_input_pointer_GetPointerInfoHistory(uint32_t pointerid, void* entriescount, void* pointerinfo);
int32_t windowssys_windows_win32_ui_input_pointer_GetPointerInputTransform(uint32_t pointerid, uint32_t historycount, void* inputtransform);
int32_t windowssys_windows_win32_ui_input_pointer_GetPointerPenInfo(uint32_t pointerid, void* peninfo);
int32_t windowssys_windows_win32_ui_input_pointer_GetPointerPenInfoHistory(uint32_t pointerid, void* entriescount, void* peninfo);
int32_t windowssys_windows_win32_ui_input_pointer_GetPointerTouchInfo(uint32_t pointerid, void* touchinfo);
int32_t windowssys_windows_win32_ui_input_pointer_GetPointerTouchInfoHistory(uint32_t pointerid, void* entriescount, void* touchinfo);
int32_t windowssys_windows_win32_ui_input_pointer_GetPointerType(uint32_t pointerid, void* pointertype);
int32_t windowssys_windows_win32_ui_input_pointer_GetRawPointerDeviceData(uint32_t pointerid, uint32_t historycount, uint32_t propertiescount, void* pproperties, void* pvalues);
uint32_t windowssys_windows_win32_ui_input_pointer_GetUnpredictedMessagePos(void);
int32_t windowssys_windows_win32_ui_input_pointer_InitializeTouchInjection(uint32_t maxcount, uint32_t dwmode);
int32_t windowssys_windows_win32_ui_input_pointer_InjectSyntheticPointerInput(void* device, void* pointerinfo, uint32_t count);
int32_t windowssys_windows_win32_ui_input_pointer_InjectTouchInput(uint32_t count, void* contacts);
int32_t windowssys_windows_win32_ui_input_pointer_IsMouseInPointerEnabled(void);
int32_t windowssys_windows_win32_ui_input_pointer_SkipPointerFrameMessages(uint32_t pointerid);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_POINTER_WINDOWS_WIN32_UI_INPUT_POINTER_WRAPPER_H */
