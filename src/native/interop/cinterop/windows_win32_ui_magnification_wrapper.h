#ifndef WINDOWSSYS_WINDOWS_WIN32_UI_MAGNIFICATION_WINDOWS_WIN32_UI_MAGNIFICATION_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_UI_MAGNIFICATION_WINDOWS_WIN32_UI_MAGNIFICATION_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_ui_magnification_magGetColorEffect(void* hwnd, void* peffect);
int32_t windowssys_windows_win32_ui_magnification_magGetFullscreenColorEffect(void* peffect);
int32_t windowssys_windows_win32_ui_magnification_magGetFullscreenTransform(void* pmaglevel, void* pxoffset, void* pyoffset);
void* windowssys_windows_win32_ui_magnification_magGetImageScalingCallback(void* hwnd);
int32_t windowssys_windows_win32_ui_magnification_magGetInputTransform(void* pfenabled, void* prectsource, void* prectdest);
int32_t windowssys_windows_win32_ui_magnification_magGetWindowFilterList(void* hwnd, void* pdwfiltermode, int32_t count, void* phwnd);
int32_t windowssys_windows_win32_ui_magnification_magGetWindowSource(void* hwnd, void* prect);
int32_t windowssys_windows_win32_ui_magnification_magGetWindowTransform(void* hwnd, void* ptransform);
int32_t windowssys_windows_win32_ui_magnification_magInitialize(void);
int32_t windowssys_windows_win32_ui_magnification_magSetColorEffect(void* hwnd, void* peffect);
int32_t windowssys_windows_win32_ui_magnification_magSetFullscreenColorEffect(void* peffect);
int32_t windowssys_windows_win32_ui_magnification_magSetFullscreenTransform(float maglevel, int32_t xoffset, int32_t yoffset);
int32_t windowssys_windows_win32_ui_magnification_magSetImageScalingCallback(void* hwnd, void* callback);
int32_t windowssys_windows_win32_ui_magnification_magSetInputTransform(int32_t fenabled, void* prectsource, void* prectdest);
int32_t windowssys_windows_win32_ui_magnification_magSetWindowFilterList(void* hwnd, uint32_t dwfiltermode, int32_t count, void* phwnd);
int32_t windowssys_windows_win32_ui_magnification_magSetWindowTransform(void* hwnd, void* ptransform);
int32_t windowssys_windows_win32_ui_magnification_magShowSystemCursor(int32_t fshowcursor);
int32_t windowssys_windows_win32_ui_magnification_magUninitialize(void);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_UI_MAGNIFICATION_WINDOWS_WIN32_UI_MAGNIFICATION_WRAPPER_H */
