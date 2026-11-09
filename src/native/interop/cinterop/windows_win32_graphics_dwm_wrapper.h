#ifndef WINDOWSSYS_WINDOWS_WIN32_GRAPHICS_DWM_WINDOWS_WIN32_GRAPHICS_DWM_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_GRAPHICS_DWM_WINDOWS_WIN32_GRAPHICS_DWM_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_graphics_dwm_DwmAttachMilContent(void* hwnd);
int32_t windowssys_windows_win32_graphics_dwm_DwmDefWindowProc(void* hwnd, uint32_t msg, uint64_t wparam, int64_t lparam, void* plresult);
int32_t windowssys_windows_win32_graphics_dwm_DwmDetachMilContent(void* hwnd);
int32_t windowssys_windows_win32_graphics_dwm_DwmEnableBlurBehindWindow(void* hwnd, void* pblurbehind);
int32_t windowssys_windows_win32_graphics_dwm_DwmEnableComposition(uint32_t ucompositionaction);
int32_t windowssys_windows_win32_graphics_dwm_DwmEnableMMCSS(int32_t fenablemmcss);
int32_t windowssys_windows_win32_graphics_dwm_DwmExtendFrameIntoClientArea(void* hwnd, void* pmarinset);
int32_t windowssys_windows_win32_graphics_dwm_DwmFlush(void);
int32_t windowssys_windows_win32_graphics_dwm_DwmGetColorizationColor(void* pcrcolorization, void* pfopaqueblend);
int32_t windowssys_windows_win32_graphics_dwm_DwmGetCompositionTimingInfo(void* hwnd, void* ptiminginfo);
int32_t windowssys_windows_win32_graphics_dwm_DwmGetGraphicsStreamClient(uint32_t uindex, void* pclientuuid);
int32_t windowssys_windows_win32_graphics_dwm_DwmGetGraphicsStreamTransformHint(uint32_t uindex, void* ptransform);
int32_t windowssys_windows_win32_graphics_dwm_DwmGetTransportAttributes(void* pfisremoting, void* pfisconnected, void* pdwgeneration);
int32_t windowssys_windows_win32_graphics_dwm_DwmGetUnmetTabRequirements(void* appwindow, void* value);
int32_t windowssys_windows_win32_graphics_dwm_DwmGetWindowAttribute(void* hwnd, uint32_t dwattribute, void* pvattribute, uint32_t cbattribute);
int32_t windowssys_windows_win32_graphics_dwm_DwmInvalidateIconicBitmaps(void* hwnd);
int32_t windowssys_windows_win32_graphics_dwm_DwmIsCompositionEnabled(void* pfenabled);
int32_t windowssys_windows_win32_graphics_dwm_DwmModifyPreviousDxFrameDuration(void* hwnd, int32_t crefreshes, int32_t frelative);
int32_t windowssys_windows_win32_graphics_dwm_DwmQueryThumbnailSourceSize(int64_t hthumbnail, void* psize);
int32_t windowssys_windows_win32_graphics_dwm_DwmRegisterThumbnail(void* hwnddestination, void* hwndsource, void* phthumbnailid);
int32_t windowssys_windows_win32_graphics_dwm_DwmRenderGesture(int32_t gt, uint32_t ccontacts, void* pdwpointerid, void* ppoints);
int32_t windowssys_windows_win32_graphics_dwm_DwmSetDxFrameDuration(void* hwnd, int32_t crefreshes);
int32_t windowssys_windows_win32_graphics_dwm_DwmSetIconicLivePreviewBitmap(void* hwnd, void* hbmp, void* pptclient, uint32_t dwsitflags);
int32_t windowssys_windows_win32_graphics_dwm_DwmSetIconicThumbnail(void* hwnd, void* hbmp, uint32_t dwsitflags);
int32_t windowssys_windows_win32_graphics_dwm_DwmSetPresentParameters(void* hwnd, void* ppresentparams);
int32_t windowssys_windows_win32_graphics_dwm_DwmSetWindowAttribute(void* hwnd, uint32_t dwattribute, void* pvattribute, uint32_t cbattribute);
int32_t windowssys_windows_win32_graphics_dwm_DwmShowContact(uint32_t dwpointerid, uint32_t eshowcontact);
int32_t windowssys_windows_win32_graphics_dwm_DwmTransitionOwnedWindow(void* hwnd, int32_t target);
int32_t windowssys_windows_win32_graphics_dwm_DwmUnregisterThumbnail(int64_t hthumbnailid);
int32_t windowssys_windows_win32_graphics_dwm_DwmUpdateThumbnailProperties(int64_t hthumbnailid, void* ptnproperties);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_GRAPHICS_DWM_WINDOWS_WIN32_GRAPHICS_DWM_WRAPPER_H */
