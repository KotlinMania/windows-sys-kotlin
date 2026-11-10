#ifndef WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_POINTER_WINDOWS_WIN32_UI_INPUT_POINTER_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_POINTER_WINDOWS_WIN32_UI_INPUT_POINTER_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_ui_input_pointer_enableMouseInPointer(int32_t fenable);
int32_t windowssys_windows_win32_ui_input_pointer_getPointerCursorId(uint32_t pointerid, void* cursorid);
int32_t windowssys_windows_win32_ui_input_pointer_getPointerDevice(void* device, void* pointerdevice);
int32_t windowssys_windows_win32_ui_input_pointer_getPointerDeviceCursors(void* device, void* cursorcount, void* devicecursors);
int32_t windowssys_windows_win32_ui_input_pointer_getPointerDeviceProperties(void* device, void* propertycount, void* pointerproperties);
int32_t windowssys_windows_win32_ui_input_pointer_getPointerDeviceRects(void* device, void* pointerdevicerect, void* displayrect);
int32_t windowssys_windows_win32_ui_input_pointer_getPointerDevices(void* devicecount, void* pointerdevices);
int32_t windowssys_windows_win32_ui_input_pointer_getPointerFrameInfo(uint32_t pointerid, void* pointercount, void* pointerinfo);
int32_t windowssys_windows_win32_ui_input_pointer_getPointerFrameInfoHistory(uint32_t pointerid, void* entriescount, void* pointercount, void* pointerinfo);
int32_t windowssys_windows_win32_ui_input_pointer_getPointerFramePenInfo(uint32_t pointerid, void* pointercount, void* peninfo);
int32_t windowssys_windows_win32_ui_input_pointer_getPointerFramePenInfoHistory(uint32_t pointerid, void* entriescount, void* pointercount, void* peninfo);
int32_t windowssys_windows_win32_ui_input_pointer_getPointerFrameTouchInfo(uint32_t pointerid, void* pointercount, void* touchinfo);
int32_t windowssys_windows_win32_ui_input_pointer_getPointerFrameTouchInfoHistory(uint32_t pointerid, void* entriescount, void* pointercount, void* touchinfo);
int32_t windowssys_windows_win32_ui_input_pointer_getPointerInfo(uint32_t pointerid, void* pointerinfo);
int32_t windowssys_windows_win32_ui_input_pointer_getPointerInfoHistory(uint32_t pointerid, void* entriescount, void* pointerinfo);
int32_t windowssys_windows_win32_ui_input_pointer_getPointerInputTransform(uint32_t pointerid, uint32_t historycount, void* inputtransform);
int32_t windowssys_windows_win32_ui_input_pointer_getPointerPenInfo(uint32_t pointerid, void* peninfo);
int32_t windowssys_windows_win32_ui_input_pointer_getPointerPenInfoHistory(uint32_t pointerid, void* entriescount, void* peninfo);
int32_t windowssys_windows_win32_ui_input_pointer_getPointerTouchInfo(uint32_t pointerid, void* touchinfo);
int32_t windowssys_windows_win32_ui_input_pointer_getPointerTouchInfoHistory(uint32_t pointerid, void* entriescount, void* touchinfo);
int32_t windowssys_windows_win32_ui_input_pointer_getPointerType(uint32_t pointerid, void* pointertype);
int32_t windowssys_windows_win32_ui_input_pointer_getRawPointerDeviceData(uint32_t pointerid, uint32_t historycount, uint32_t propertiescount, void* pproperties, void* pvalues);
uint32_t windowssys_windows_win32_ui_input_pointer_getUnpredictedMessagePos(void);
int32_t windowssys_windows_win32_ui_input_pointer_initializeTouchInjection(uint32_t maxcount, uint32_t dwmode);
int32_t windowssys_windows_win32_ui_input_pointer_injectSyntheticPointerInput(void* device, void* pointerinfo, uint32_t count);
int32_t windowssys_windows_win32_ui_input_pointer_injectTouchInput(uint32_t count, void* contacts);
int32_t windowssys_windows_win32_ui_input_pointer_isMouseInPointerEnabled(void);
int32_t windowssys_windows_win32_ui_input_pointer_skipPointerFrameMessages(uint32_t pointerid);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_POINTER_WINDOWS_WIN32_UI_INPUT_POINTER_WRAPPER_H */
