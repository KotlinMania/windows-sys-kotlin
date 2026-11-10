#ifndef WINDOWSSYS_WINDOWS_WIN32_GRAPHICS_DWM_WINDOWS_WIN32_GRAPHICS_DWM_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_GRAPHICS_DWM_WINDOWS_WIN32_GRAPHICS_DWM_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_graphics_dwm_dwmAttachMilContent(void* hwnd);
int32_t windowssys_windows_win32_graphics_dwm_dwmDefWindowProc(void* hwnd, uint32_t msg, uint64_t wparam, int64_t lparam, void* plresult);
int32_t windowssys_windows_win32_graphics_dwm_dwmDetachMilContent(void* hwnd);
int32_t windowssys_windows_win32_graphics_dwm_dwmEnableBlurBehindWindow(void* hwnd, void* pblurbehind);
int32_t windowssys_windows_win32_graphics_dwm_dwmEnableComposition(uint32_t ucompositionaction);
int32_t windowssys_windows_win32_graphics_dwm_dwmEnableMMCSS(int32_t fenablemmcss);
int32_t windowssys_windows_win32_graphics_dwm_dwmExtendFrameIntoClientArea(void* hwnd, void* pmarinset);
int32_t windowssys_windows_win32_graphics_dwm_dwmFlush(void);
int32_t windowssys_windows_win32_graphics_dwm_dwmGetColorizationColor(void* pcrcolorization, void* pfopaqueblend);
int32_t windowssys_windows_win32_graphics_dwm_dwmGetCompositionTimingInfo(void* hwnd, void* ptiminginfo);
int32_t windowssys_windows_win32_graphics_dwm_dwmGetGraphicsStreamClient(uint32_t uindex, void* pclientuuid);
int32_t windowssys_windows_win32_graphics_dwm_dwmGetGraphicsStreamTransformHint(uint32_t uindex, void* ptransform);
int32_t windowssys_windows_win32_graphics_dwm_dwmGetTransportAttributes(void* pfisremoting, void* pfisconnected, void* pdwgeneration);
int32_t windowssys_windows_win32_graphics_dwm_dwmGetUnmetTabRequirements(void* appwindow, void* value);
int32_t windowssys_windows_win32_graphics_dwm_dwmGetWindowAttribute(void* hwnd, uint32_t dwattribute, void* pvattribute, uint32_t cbattribute);
int32_t windowssys_windows_win32_graphics_dwm_dwmInvalidateIconicBitmaps(void* hwnd);
int32_t windowssys_windows_win32_graphics_dwm_dwmIsCompositionEnabled(void* pfenabled);
int32_t windowssys_windows_win32_graphics_dwm_dwmModifyPreviousDxFrameDuration(void* hwnd, int32_t crefreshes, int32_t frelative);
int32_t windowssys_windows_win32_graphics_dwm_dwmQueryThumbnailSourceSize(int64_t hthumbnail, void* psize);
int32_t windowssys_windows_win32_graphics_dwm_dwmRegisterThumbnail(void* hwnddestination, void* hwndsource, void* phthumbnailid);
int32_t windowssys_windows_win32_graphics_dwm_dwmRenderGesture(int32_t gt, uint32_t ccontacts, void* pdwpointerid, void* ppoints);
int32_t windowssys_windows_win32_graphics_dwm_dwmSetDxFrameDuration(void* hwnd, int32_t crefreshes);
int32_t windowssys_windows_win32_graphics_dwm_dwmSetIconicLivePreviewBitmap(void* hwnd, void* hbmp, void* pptclient, uint32_t dwsitflags);
int32_t windowssys_windows_win32_graphics_dwm_dwmSetIconicThumbnail(void* hwnd, void* hbmp, uint32_t dwsitflags);
int32_t windowssys_windows_win32_graphics_dwm_dwmSetPresentParameters(void* hwnd, void* ppresentparams);
int32_t windowssys_windows_win32_graphics_dwm_dwmSetWindowAttribute(void* hwnd, uint32_t dwattribute, void* pvattribute, uint32_t cbattribute);
int32_t windowssys_windows_win32_graphics_dwm_dwmShowContact(uint32_t dwpointerid, uint32_t eshowcontact);
int32_t windowssys_windows_win32_graphics_dwm_dwmTransitionOwnedWindow(void* hwnd, int32_t target);
int32_t windowssys_windows_win32_graphics_dwm_dwmUnregisterThumbnail(int64_t hthumbnailid);
int32_t windowssys_windows_win32_graphics_dwm_dwmUpdateThumbnailProperties(int64_t hthumbnailid, void* ptnproperties);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_GRAPHICS_DWM_WINDOWS_WIN32_GRAPHICS_DWM_WRAPPER_H */
