#ifndef WINDOWSSYS_WINDOWS_WIN32_UI_MAGNIFICATION_WINDOWS_WIN32_UI_MAGNIFICATION_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_UI_MAGNIFICATION_WINDOWS_WIN32_UI_MAGNIFICATION_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32UiMagnificationMagGetColorEffect(void* hwnd, void* peffect);
int32_t windowssysWindowsWin32UiMagnificationMagGetFullscreenColorEffect(void* peffect);
int32_t windowssysWindowsWin32UiMagnificationMagGetFullscreenTransform(void* pmaglevel, void* pxoffset, void* pyoffset);
void* windowssysWindowsWin32UiMagnificationMagGetImageScalingCallback(void* hwnd);
int32_t windowssysWindowsWin32UiMagnificationMagGetInputTransform(void* pfenabled, void* prectsource, void* prectdest);
int32_t windowssysWindowsWin32UiMagnificationMagGetWindowFilterList(void* hwnd, void* pdwfiltermode, int32_t count, void* phwnd);
int32_t windowssysWindowsWin32UiMagnificationMagGetWindowSource(void* hwnd, void* prect);
int32_t windowssysWindowsWin32UiMagnificationMagGetWindowTransform(void* hwnd, void* ptransform);
int32_t windowssysWindowsWin32UiMagnificationMagInitialize(void);
int32_t windowssysWindowsWin32UiMagnificationMagSetColorEffect(void* hwnd, void* peffect);
int32_t windowssysWindowsWin32UiMagnificationMagSetFullscreenColorEffect(void* peffect);
int32_t windowssysWindowsWin32UiMagnificationMagSetFullscreenTransform(float maglevel, int32_t xoffset, int32_t yoffset);
int32_t windowssysWindowsWin32UiMagnificationMagSetImageScalingCallback(void* hwnd, void* callback);
int32_t windowssysWindowsWin32UiMagnificationMagSetInputTransform(int32_t fenabled, void* prectsource, void* prectdest);
int32_t windowssysWindowsWin32UiMagnificationMagSetWindowFilterList(void* hwnd, uint32_t dwfiltermode, int32_t count, void* phwnd);
int32_t windowssysWindowsWin32UiMagnificationMagSetWindowTransform(void* hwnd, void* ptransform);
int32_t windowssysWindowsWin32UiMagnificationMagShowSystemCursor(int32_t fshowcursor);
int32_t windowssysWindowsWin32UiMagnificationMagUninitialize(void);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_UI_MAGNIFICATION_WINDOWS_WIN32_UI_MAGNIFICATION_WRAPPER_H */
