#ifndef WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_POINTER_WINDOWS_WIN32_UI_INPUT_POINTER_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_POINTER_WINDOWS_WIN32_UI_INPUT_POINTER_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32UiInputPointerEnableMouseInPointer(int32_t fenable);
int32_t windowssysWindowsWin32UiInputPointerGetPointerCursorId(uint32_t pointerid, void* cursorid);
int32_t windowssysWindowsWin32UiInputPointerGetPointerDevice(void* device, void* pointerdevice);
int32_t windowssysWindowsWin32UiInputPointerGetPointerDeviceCursors(void* device, void* cursorcount, void* devicecursors);
int32_t windowssysWindowsWin32UiInputPointerGetPointerDeviceProperties(void* device, void* propertycount, void* pointerproperties);
int32_t windowssysWindowsWin32UiInputPointerGetPointerDeviceRects(void* device, void* pointerdevicerect, void* displayrect);
int32_t windowssysWindowsWin32UiInputPointerGetPointerDevices(void* devicecount, void* pointerdevices);
int32_t windowssysWindowsWin32UiInputPointerGetPointerFrameInfo(uint32_t pointerid, void* pointercount, void* pointerinfo);
int32_t windowssysWindowsWin32UiInputPointerGetPointerFrameInfoHistory(uint32_t pointerid, void* entriescount, void* pointercount, void* pointerinfo);
int32_t windowssysWindowsWin32UiInputPointerGetPointerFramePenInfo(uint32_t pointerid, void* pointercount, void* peninfo);
int32_t windowssysWindowsWin32UiInputPointerGetPointerFramePenInfoHistory(uint32_t pointerid, void* entriescount, void* pointercount, void* peninfo);
int32_t windowssysWindowsWin32UiInputPointerGetPointerFrameTouchInfo(uint32_t pointerid, void* pointercount, void* touchinfo);
int32_t windowssysWindowsWin32UiInputPointerGetPointerFrameTouchInfoHistory(uint32_t pointerid, void* entriescount, void* pointercount, void* touchinfo);
int32_t windowssysWindowsWin32UiInputPointerGetPointerInfo(uint32_t pointerid, void* pointerinfo);
int32_t windowssysWindowsWin32UiInputPointerGetPointerInfoHistory(uint32_t pointerid, void* entriescount, void* pointerinfo);
int32_t windowssysWindowsWin32UiInputPointerGetPointerInputTransform(uint32_t pointerid, uint32_t historycount, void* inputtransform);
int32_t windowssysWindowsWin32UiInputPointerGetPointerPenInfo(uint32_t pointerid, void* peninfo);
int32_t windowssysWindowsWin32UiInputPointerGetPointerPenInfoHistory(uint32_t pointerid, void* entriescount, void* peninfo);
int32_t windowssysWindowsWin32UiInputPointerGetPointerTouchInfo(uint32_t pointerid, void* touchinfo);
int32_t windowssysWindowsWin32UiInputPointerGetPointerTouchInfoHistory(uint32_t pointerid, void* entriescount, void* touchinfo);
int32_t windowssysWindowsWin32UiInputPointerGetPointerType(uint32_t pointerid, void* pointertype);
int32_t windowssysWindowsWin32UiInputPointerGetRawPointerDeviceData(uint32_t pointerid, uint32_t historycount, uint32_t propertiescount, void* pproperties, void* pvalues);
uint32_t windowssysWindowsWin32UiInputPointerGetUnpredictedMessagePos(void);
int32_t windowssysWindowsWin32UiInputPointerInitializeTouchInjection(uint32_t maxcount, uint32_t dwmode);
int32_t windowssysWindowsWin32UiInputPointerInjectSyntheticPointerInput(void* device, void* pointerinfo, uint32_t count);
int32_t windowssysWindowsWin32UiInputPointerInjectTouchInput(uint32_t count, void* contacts);
int32_t windowssysWindowsWin32UiInputPointerIsMouseInPointerEnabled(void);
int32_t windowssysWindowsWin32UiInputPointerSkipPointerFrameMessages(uint32_t pointerid);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_POINTER_WINDOWS_WIN32_UI_INPUT_POINTER_WRAPPER_H */
