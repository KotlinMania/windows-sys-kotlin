#ifndef WINDOWSSYS_WINDOWS_WIN32_GRAPHICS_DWM_WINDOWS_WIN32_GRAPHICS_DWM_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_GRAPHICS_DWM_WINDOWS_WIN32_GRAPHICS_DWM_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32GraphicsDwmDwmAttachMilContent(void* hwnd);
int32_t windowssysWindowsWin32GraphicsDwmDwmDefWindowProc(void* hwnd, uint32_t msg, uint64_t wparam, int64_t lparam, void* plresult);
int32_t windowssysWindowsWin32GraphicsDwmDwmDetachMilContent(void* hwnd);
int32_t windowssysWindowsWin32GraphicsDwmDwmEnableBlurBehindWindow(void* hwnd, void* pblurbehind);
int32_t windowssysWindowsWin32GraphicsDwmDwmEnableComposition(uint32_t ucompositionaction);
int32_t windowssysWindowsWin32GraphicsDwmDwmEnableMMCSS(int32_t fenablemmcss);
int32_t windowssysWindowsWin32GraphicsDwmDwmExtendFrameIntoClientArea(void* hwnd, void* pmarinset);
int32_t windowssysWindowsWin32GraphicsDwmDwmFlush(void);
int32_t windowssysWindowsWin32GraphicsDwmDwmGetColorizationColor(void* pcrcolorization, void* pfopaqueblend);
int32_t windowssysWindowsWin32GraphicsDwmDwmGetCompositionTimingInfo(void* hwnd, void* ptiminginfo);
int32_t windowssysWindowsWin32GraphicsDwmDwmGetGraphicsStreamClient(uint32_t uindex, void* pclientuuid);
int32_t windowssysWindowsWin32GraphicsDwmDwmGetGraphicsStreamTransformHint(uint32_t uindex, void* ptransform);
int32_t windowssysWindowsWin32GraphicsDwmDwmGetTransportAttributes(void* pfisremoting, void* pfisconnected, void* pdwgeneration);
int32_t windowssysWindowsWin32GraphicsDwmDwmGetUnmetTabRequirements(void* appwindow, void* value);
int32_t windowssysWindowsWin32GraphicsDwmDwmGetWindowAttribute(void* hwnd, uint32_t dwattribute, void* pvattribute, uint32_t cbattribute);
int32_t windowssysWindowsWin32GraphicsDwmDwmInvalidateIconicBitmaps(void* hwnd);
int32_t windowssysWindowsWin32GraphicsDwmDwmIsCompositionEnabled(void* pfenabled);
int32_t windowssysWindowsWin32GraphicsDwmDwmModifyPreviousDxFrameDuration(void* hwnd, int32_t crefreshes, int32_t frelative);
int32_t windowssysWindowsWin32GraphicsDwmDwmQueryThumbnailSourceSize(int64_t hthumbnail, void* psize);
int32_t windowssysWindowsWin32GraphicsDwmDwmRegisterThumbnail(void* hwnddestination, void* hwndsource, void* phthumbnailid);
int32_t windowssysWindowsWin32GraphicsDwmDwmRenderGesture(int32_t gt, uint32_t ccontacts, void* pdwpointerid, void* ppoints);
int32_t windowssysWindowsWin32GraphicsDwmDwmSetDxFrameDuration(void* hwnd, int32_t crefreshes);
int32_t windowssysWindowsWin32GraphicsDwmDwmSetIconicLivePreviewBitmap(void* hwnd, void* hbmp, void* pptclient, uint32_t dwsitflags);
int32_t windowssysWindowsWin32GraphicsDwmDwmSetIconicThumbnail(void* hwnd, void* hbmp, uint32_t dwsitflags);
int32_t windowssysWindowsWin32GraphicsDwmDwmSetPresentParameters(void* hwnd, void* ppresentparams);
int32_t windowssysWindowsWin32GraphicsDwmDwmSetWindowAttribute(void* hwnd, uint32_t dwattribute, void* pvattribute, uint32_t cbattribute);
int32_t windowssysWindowsWin32GraphicsDwmDwmShowContact(uint32_t dwpointerid, uint32_t eshowcontact);
int32_t windowssysWindowsWin32GraphicsDwmDwmTransitionOwnedWindow(void* hwnd, int32_t target);
int32_t windowssysWindowsWin32GraphicsDwmDwmUnregisterThumbnail(int64_t hthumbnailid);
int32_t windowssysWindowsWin32GraphicsDwmDwmUpdateThumbnailProperties(int64_t hthumbnailid, void* ptnproperties);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_GRAPHICS_DWM_WINDOWS_WIN32_GRAPHICS_DWM_WRAPPER_H */
