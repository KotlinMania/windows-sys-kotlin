#ifndef WINDOWSSYS_WINDOWS_WIN32_UI_MAGNIFICATION_WINDOWS_WIN32_UI_MAGNIFICATION_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_UI_MAGNIFICATION_WINDOWS_WIN32_UI_MAGNIFICATION_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_ui_magnification_MagGetColorEffect(void* hwnd, void* peffect);
int32_t windowssys_windows_win32_ui_magnification_MagGetFullscreenColorEffect(void* peffect);
int32_t windowssys_windows_win32_ui_magnification_MagGetFullscreenTransform(void* pmaglevel, void* pxoffset, void* pyoffset);
void* windowssys_windows_win32_ui_magnification_MagGetImageScalingCallback(void* hwnd);
int32_t windowssys_windows_win32_ui_magnification_MagGetInputTransform(void* pfenabled, void* prectsource, void* prectdest);
int32_t windowssys_windows_win32_ui_magnification_MagGetWindowFilterList(void* hwnd, void* pdwfiltermode, int32_t count, void* phwnd);
int32_t windowssys_windows_win32_ui_magnification_MagGetWindowSource(void* hwnd, void* prect);
int32_t windowssys_windows_win32_ui_magnification_MagGetWindowTransform(void* hwnd, void* ptransform);
int32_t windowssys_windows_win32_ui_magnification_MagInitialize(void);
int32_t windowssys_windows_win32_ui_magnification_MagSetColorEffect(void* hwnd, void* peffect);
int32_t windowssys_windows_win32_ui_magnification_MagSetFullscreenColorEffect(void* peffect);
int32_t windowssys_windows_win32_ui_magnification_MagSetFullscreenTransform(float maglevel, int32_t xoffset, int32_t yoffset);
int32_t windowssys_windows_win32_ui_magnification_MagSetImageScalingCallback(void* hwnd, void* callback);
int32_t windowssys_windows_win32_ui_magnification_MagSetInputTransform(int32_t fenabled, void* prectsource, void* prectdest);
int32_t windowssys_windows_win32_ui_magnification_MagSetWindowFilterList(void* hwnd, uint32_t dwfiltermode, int32_t count, void* phwnd);
int32_t windowssys_windows_win32_ui_magnification_MagSetWindowTransform(void* hwnd, void* ptransform);
int32_t windowssys_windows_win32_ui_magnification_MagShowSystemCursor(int32_t fshowcursor);
int32_t windowssys_windows_win32_ui_magnification_MagUninitialize(void);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_UI_MAGNIFICATION_WINDOWS_WIN32_UI_MAGNIFICATION_WRAPPER_H */
