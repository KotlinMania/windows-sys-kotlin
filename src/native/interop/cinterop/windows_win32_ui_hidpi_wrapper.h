#ifndef WINDOWSSYS_WINDOWS_WIN32_UI_HIDPI_WINDOWS_WIN32_UI_HIDPI_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_UI_HIDPI_WINDOWS_WIN32_UI_HIDPI_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32UiHidpiAdjustWindowRectExForDpi(void* lprect, uint32_t dwstyle, int32_t bmenu, uint32_t dwexstyle, uint32_t dpi);
int32_t windowssysWindowsWin32UiHidpiAreDpiAwarenessContextsEqual(void* dpicontexta, void* dpicontextb);
int32_t windowssysWindowsWin32UiHidpiEnableNonClientDpiScaling(void* hwnd);
int32_t windowssysWindowsWin32UiHidpiGetAwarenessFromDpiAwarenessContext(void* value);
int32_t windowssysWindowsWin32UiHidpiGetDialogControlDpiChangeBehavior(void* hwnd);
int32_t windowssysWindowsWin32UiHidpiGetDialogDpiChangeBehavior(void* hdlg);
void* windowssysWindowsWin32UiHidpiGetDpiAwarenessContextForProcess(void* hprocess);
int32_t windowssysWindowsWin32UiHidpiGetDpiForMonitor(void* hmonitor, int32_t dpitype, void* dpix, void* dpiy);
uint32_t windowssysWindowsWin32UiHidpiGetDpiForSystem(void);
uint32_t windowssysWindowsWin32UiHidpiGetDpiForWindow(void* hwnd);
uint32_t windowssysWindowsWin32UiHidpiGetDpiFromDpiAwarenessContext(void* value);
int32_t windowssysWindowsWin32UiHidpiGetProcessDpiAwareness(void* hprocess, void* value);
uint32_t windowssysWindowsWin32UiHidpiGetSystemDpiForProcess(void* hprocess);
int32_t windowssysWindowsWin32UiHidpiGetSystemMetricsForDpi(int32_t nindex, uint32_t dpi);
void* windowssysWindowsWin32UiHidpiGetThreadDpiAwarenessContext(void);
int32_t windowssysWindowsWin32UiHidpiGetThreadDpiHostingBehavior(void);
void* windowssysWindowsWin32UiHidpiGetWindowDpiAwarenessContext(void* hwnd);
int32_t windowssysWindowsWin32UiHidpiGetWindowDpiHostingBehavior(void* hwnd);
int32_t windowssysWindowsWin32UiHidpiIsValidDpiAwarenessContext(void* value);
int32_t windowssysWindowsWin32UiHidpiLogicalToPhysicalPointForPerMonitorDPI(void* hwnd, void* lppoint);
int64_t windowssysWindowsWin32UiHidpiOpenThemeDataForDpi(void* hwnd, void* pszclasslist, uint32_t dpi);
int32_t windowssysWindowsWin32UiHidpiPhysicalToLogicalPointForPerMonitorDPI(void* hwnd, void* lppoint);
int32_t windowssysWindowsWin32UiHidpiSetDialogControlDpiChangeBehavior(void* hwnd, int32_t mask, int32_t values);
int32_t windowssysWindowsWin32UiHidpiSetDialogDpiChangeBehavior(void* hdlg, int32_t mask, int32_t values);
int32_t windowssysWindowsWin32UiHidpiSetProcessDpiAwareness(int32_t value);
int32_t windowssysWindowsWin32UiHidpiSetProcessDpiAwarenessContext(void* value);
void* windowssysWindowsWin32UiHidpiSetThreadDpiAwarenessContext(void* dpicontext);
int32_t windowssysWindowsWin32UiHidpiSetThreadDpiHostingBehavior(int32_t value);
int32_t windowssysWindowsWin32UiHidpiSystemParametersInfoForDpi(uint32_t uiaction, uint32_t uiparam, void* pvparam, uint32_t fwinini, uint32_t dpi);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_UI_HIDPI_WINDOWS_WIN32_UI_HIDPI_WRAPPER_H */
